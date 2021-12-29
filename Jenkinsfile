pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Start Build...'
                bat 'mvn clean package -Dmaven.test.skip=true'
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
                echo 'Clean...'
                bat 'schtasks /delete /f /tn jira-demo  1 > null 2 > null'

                echo 'Start Deploy...'
                bat 'schtasks /create /tn jira-demo /tr "java -jar D:/Github/jira-demo_new/target/helloworld-0.0.1-SNAPSHOT.jar" /sc once /st 00:00:00 /sd 2021/01/01'
                bat 'schtasks /run /tn jira-demo'
            }
            post {
               always {
                   echo 'Notify: jiraSendDeploymentInfo...'
                   jiraSendDeploymentInfo environmentId: 'Win8-Laptop', environmentName: 'Win8-Laptop', environmentType: 'staging', site: 'statestreet-cloud-sandbox-235.atlassian.net'
               }
            }
        }
    }
}
