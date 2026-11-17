pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {
        stage('Build') {
            steps { sh 'mvn -B clean package' }
        }
    }

    post {
        always  { junit 'target/surefire-reports/*.xml' }
        success { archiveArtifacts 'target/*.jar' }
    }
}
