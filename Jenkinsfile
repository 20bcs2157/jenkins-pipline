pipeline {
    agent any
     tools {
        maven 'maven3.0'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/20bcs2157/jenkins-pipline.git/'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }
    }
}
