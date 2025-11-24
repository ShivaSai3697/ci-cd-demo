pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ShivaSai3697/ci-cd-demo.git'
            }
        }

        stage('Set Git Remote (Fix)') {
            steps {
                dir('ci-cd-demo') {        // <-- VERY IMPORTANT!!!
                    sh 'git config remote.origin.url https://github.com/ShivaSai3697/ci-cd-demo.git'
                }
            }
        }

        stage('Build') {
            steps {
                dir('ci-cd-demo') {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Docker Build') {
            steps {
                dir('ci-cd-demo') {
                    sh 'docker build -t democi .'
                }
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker run -d -p 9090:9090 --name democi democi'
            }
        }
    }
}

