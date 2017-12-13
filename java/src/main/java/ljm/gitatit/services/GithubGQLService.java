package ljm.gitatit.services;

import com.coxautodev.graphql.tools.SchemaParser;

import java.io.Serializable;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;
import ljm.gitatit.data.PullRequest;

/**
 * @author 		lmynsberge
 * @version 	0.1
 * @description The GraphQL endpoint for Github
 */
@WebServlet(urlPatterns = "/graphql")
public class GithubGQLService extends SimpleGraphQLServlet implements IRepoService {

	private static final long serialVersionUID = 1L;

	public GithubGQLService() {
        super(SchemaParser.newParser()
                .file("schema.graphqls") //parse the schema file created earlier
                .build()
                .makeExecutableSchema());
    }

	@Override
	public ArrayList<PullRequest> GetResponse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void MakeRequest(Serializable requestObject) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLogger(ILogger logger) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ILogger getLogger() {
		// TODO Auto-generated method stub
		return null;
	}
}