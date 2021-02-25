pipeline {
    agent {
        node { label 'docker' }
    }
    tools {
            maven 'Maven'
        }
    stages {
        stage('Test') {
            steps {
                sh 'mvn clean test -Pfailsafe'
            }
        }
    }
}