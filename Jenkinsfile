pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Start Build...'
				bat 'mvn package -Dmaven.test.skip=true'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Start Deploy...'
				bat 'java -jar helloworld-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
