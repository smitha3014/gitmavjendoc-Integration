pipeline {
    agent any
     stages {
        stage('maven version') {
            steps {
               bat 'mvn --version'
            }
        }
        stage("build test") {
            steps {
               bat "mvn clean test"
            }
        }
     }
  }