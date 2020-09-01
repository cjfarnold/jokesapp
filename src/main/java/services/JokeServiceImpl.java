package services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
	private final ChuckNorrisQuotes chuckNorisQuotes;

	public JokeServiceImpl() {

		this.chuckNorisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		
		return chuckNorisQuotes.getRandomQuote();
	}

	

}
