pipeline {
    agent {
        selenium-hub { node 'selenium-hub' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}