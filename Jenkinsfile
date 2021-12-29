pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Start Build...'
                bat 'mvn package -Dmaven.test.skip=true'
            }
            post {
               success {
                   echo 'Notify: jiraSendBuildInfo...'
                   jiraSendBuildInfo branch: 'main', site: 'statestreet-cloud-sandbox-235.atlassian.net'
               }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Start Deploy...'
                bat 'start /b java -jar target/helloworld-0.0.1-SNAPSHOT.jar'
            }
            post {
               success {
                   echo 'Notify: jiraSendDeploymentInfo...'
                   jiraSendDeploymentInfo environmentId: 'Win8-Laptop', environmentName: 'Win8-Laptop', environmentType: 'development', issueKeys: ['GTS-4;GTS-5'], site: 'statestreet-cloud-sandbox-235.atlassian.net', state: 'successful'
               }
            }
        }
    }
}

