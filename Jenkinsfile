pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                echo 'Start Clean...'
                bat 'curl -X POST localhost:8089/actuator/shutdown'
            }
        }
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
                bat 'schtasks /run /tn jira-demo'
            }
            post {
               always {
                   echo 'Notify: jiraSendDeploymentInfo...'
                   jiraSendDeploymentInfo environmentId: 'Win8-Laptop', environmentName: 'Win8-Laptop', environmentType: 'testing', site: 'statestreet-cloud-sandbox-235.atlassian.net'
               }
            }
        }
    }
}
