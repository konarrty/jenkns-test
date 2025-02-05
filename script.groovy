
def param(){
    object = load 'par.groovy'
    return object.par()
}
properties(param())
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