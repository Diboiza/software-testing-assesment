pipeline {
    agent {
        docker { node 'selenium-hub' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}