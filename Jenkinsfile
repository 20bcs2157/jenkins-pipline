pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/20bcs2157/jenkins-pipline/tree/master/springboot-docker'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
