pipeline {
    agent any
    stages {
        stage(‘maven version’) {
            steps {
                bat 'mvn --version'
            }
          }
      
        stage(‘execute build’) {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}