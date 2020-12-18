pipeline{
	agent any
	parameters{choice(name: 'buildtool', choices:['gradle','maven'], description:'Parametros de herramientas a elegir')}
	stages{
			stage('Pipeline'){
				steps{
				echo 'aca'
			
			
				}
				
			}
	}

   post {
        always {
           slackSend channel: 'U01DK543PKN', color: 'good', message: "Ejecucion exitosa", teamDomain: 'divdevopsusach2020', tokenCredentialId: 'slack-Token'
        }
        failure {
			slackSend channel: 'U01DK543PKN', color: 'danger', message: "Ejecucion fallida", teamDomain: 'divdevopsusach2020', tokenCredentialId: 'slack-Token'
        }
    }
}

