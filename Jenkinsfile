pipeline {
    agent any

    stages {
        stage('Maven Build') {
            steps {
                sh "mvn clean package"
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t democi ."
            }
        }

        stage('Run Container') {
            steps {
                sh "docker rm -f democi || true"
                sh "docker run -d --name democi -p 9090:8080 democi"
            }
        }
    }
}
