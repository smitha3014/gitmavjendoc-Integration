pipeline {
    agent any
    stages {
        stage(‘maven version’) {
            steps {
                bat label: '', script: 'mvn --version'
            }
          }
      
        stage(‘execute build’) {
            steps {
                bat label: '', script: 'mvn clean test'
            }
        }
    }
}