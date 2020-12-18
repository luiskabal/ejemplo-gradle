pipeline{
	agent any
	parameters{choice(name: 'buildtool', choices:['gradle','maven'], description:'Parametros de herramientas a elegir')}
	stages{
			stage('Pipeline'){
				steps{
					script{
					def pipe=load"${params.buildtool}.groovy"
					pipe.call()	
					}
				}
				
			}
	}

   post {
		
        success {
           slackSend channel: 'U01DK543PKN', color: 'good', message: "[Luis Varas Q][${JOB_NAME}][${params.buildtool}] Ejecucion exitosa", teamDomain: 'dipdevopsusach2020', tokenCredentialId: 'slack-Token'
        }
		failure {
			slackSend channel: 'U01DK543PKN', color: 'danger', message: "[Luis Varas Q][${JOB_NAME}][${params.buildtool}] Ejecucion fallida en "[${env.Tarea}], teamDomain: 'dipdevopsusach2020', tokenCredentialId: 'slack-Token'
		}
    }
}

