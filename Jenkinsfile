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
        stage('Deploy'){
            steps {
                sh "mvn spring-boot:run"
            }
        }
    }
}
