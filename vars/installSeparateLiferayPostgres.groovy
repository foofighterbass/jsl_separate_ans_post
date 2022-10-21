def call(Map config = [:]) {
    git branch: 'main', url: 'https://github.com/foofighterbass/ansible_liferay.git'
    ansiblePlaybook become: true, credentialsId: 'ansible', disableHostKeyChecking: true, installation: 'ansible2', inventory: 'hosts.ini', playbook: 'main.yml', extras: "-l \"${config.host}\""
}