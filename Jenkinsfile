pipeline {
    agent {
        docker { image 'selenium-hub' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}