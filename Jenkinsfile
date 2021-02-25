pipeline {
    agent {
        docker { node 'selenium-hub' }
    }
    stages {
        stage("Checkout") {
              steps {
                checkout scm
              }
            }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}