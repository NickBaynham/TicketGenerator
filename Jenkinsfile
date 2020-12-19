pipeline {
    agent any
    tools {
        maven "M3"
    }
    stages {
        stage("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/nickbaynham/TicketGenerator.git'
            }
        }
        stage("Compile") {
            steps {
                sh "mvn compile"
            }
        }
        stage("Unit Tests") {
            steps {
                sh "mvn test"
            }
        }
    }
}