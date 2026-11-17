pipeline {
    agent any

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
