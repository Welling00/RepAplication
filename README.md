### After you check this project follow the steps bellow:

1. Open IDE new project form existing sources.
	- Maven project
	- select pom.xml
2. Install required plugins and dependincies (recomend turning on auto import from maven)

3. Open up apllication.config file in resources package. All DB conections are set up email for DB password.

4. To view DB download MySQL Workbench
	- New Connection
	- Conection Name <your choice>
	- Connection Method: Standard(TCP/IP)
	- Parameters:
		- Hostname: onerepdev.cnyy7lrf4edc.us-east-1.rds.amazonaws.com
		- Port: 3306
		- Password: <supplyed in email> (Store it in Vault)
		- Username: onerepdev
	- Test Connection (Sessfull)
	- Connect
5. Access here http://localhost:8181/

6. Inorder to push changes you will need to add a SSH key to your git.  A helpfull guide is: 
https://help.github.com/en/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent#generating-a-new-ssh-key 
Follow it to the letter.

### Contact info 
> [Discord](https://discord.gg/UFVVXdb)

> Email [Phil Leonard](phillipwelling@yahoo.com)

### Future
This will be linked to an Angular front end all controllers should use the @CrossOrigin() anotation with the Angular hostname and port included.