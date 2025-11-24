pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ShivaSai3697/ci-cd-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t democi .'
            }
        }

        stage('Run Container') {
            steps {
                sh '''
                      docker rm -f democi || true
                      docker run -d --name democi -p 9090:9090 democi
                   '''
            }
        }
    }
}
