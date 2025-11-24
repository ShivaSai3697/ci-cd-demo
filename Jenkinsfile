pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/ShivaSai3697/ci-cd-demo.git',
                    credentialsId: 'github-creds'
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t ci-cd-demo .'
            }
        }

        stage('Deploy Container') {
            steps {
                sh '''
                  docker rm -f ci-cd-demo || true
                  docker run -d --name ci-cd-demo -p 9090:9090 ci-cd-demo
                '''
            }
        }
    }
}
