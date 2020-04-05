package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service(value = "i18nService")
@Profile(value = "GER")
public class I18nGermanGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Guten Nachmittag";
	}

}
