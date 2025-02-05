def object = load 'par.groovy'
pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                script {
                          echo "Hello"
                      }

                    }
            }
        }
    }