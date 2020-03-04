pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                ./mvnw clean package -DskipTests
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                ./mvnw test
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}