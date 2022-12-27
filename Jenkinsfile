pipeline {
    agent any
    stages {
        stage(‘maven version’) {
            steps {
                bat 'mvn --version'
            }
        stage(‘cloning repository’) {
            steps {
                git 'https://github.com/smitha3014/gitmavjendoc-Integration.git'
            }
        stage(‘execute build’) {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}