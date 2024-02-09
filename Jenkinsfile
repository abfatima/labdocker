pipeline {
    agent any

    tools {
        maven 'maven3'
        jdk 'JDK17'
    }

    stages {
    
        stage('Salutation à tout le monde devops') {
        
            steps {
                echo 'Bonjour tout le monde'
            }
        }

        stage('Creation du jar ') {

            steps {
                sh 'mvn clean install -DskipTests'
            }
               
        }

        stage('build docker image sur serveur') {

            steps {
                sh 'docker build -t labdocker .'
            }

        }
    }
}
