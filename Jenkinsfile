
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Downloading Spring Boot source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Spring Boot application'
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running test cases'
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating JAR file'
                bat 'mvn package'
            }
        }

        stage('Success') {
            steps {
                echo 'BUILD SUCCESSFUL!'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully'
        }

        failure {
            echo 'BUILD FAILED - Check console output'
        }
    }
}
