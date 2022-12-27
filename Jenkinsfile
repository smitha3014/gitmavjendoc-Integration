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
        stage("build test") {
            steps {
               cucumber buildStatus: 'null', customCssFiles: '', customJsFiles: '', failedFeaturesNumber: -1, failedScenariosNumber: -1, failedStepsNumber: -1, fileIncludePattern: '**/*.json', pendingStepsNumber: -1, skippedStepsNumber: -1, sortingMethod: 'ALPHABETICAL', undefinedStepsNumber: -1
            }
        }
     }
  }