
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building Maven project'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running test cases'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating JAR file'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build Successful!'
        }
        failure {
            echo 'Build Failed!'
        }
    }
}
