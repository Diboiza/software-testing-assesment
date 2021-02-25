pipeline {
    agent {
        node { label 'docker' }
    }
    tools {
            maven 'Maven'
        }
    stages {
         stage ('Initialize') {
            steps {
                 sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                    '''
                    }
                }
        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}