pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git "https://github.com/cefeon/JenkinsFirst"
                sh "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Dockerbuild'){
            steps {
                docker build -f Dockerfile -t jenkins-first .
            }
        }

        stage('Dockerrun'){
            steps {
                docker run -p 8091:8091 jenkins-first
            }
        }

    }
}
