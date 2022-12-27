pipeline {
    agent any
     stages {
        stage("Tools initialization") {
            steps {
                sh "mvn --version"
                sh "java -version"
            }
        }
        stage("Building test") {
            steps {
               sh "mvn clean test"
            }
        }
     }
  }