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
         stage('Build') {
            steps {
                dir('springboot-docker') {  // Change 'your-project-folder' to the correct directory containing pom.xml
                    bat 'mvn clean install'
                }
            }
    }
}
