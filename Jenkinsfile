pipeline {
    agent {
        node { label 'docker' }
    }
    tools {
            maven 'Maven 3.3.9'
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