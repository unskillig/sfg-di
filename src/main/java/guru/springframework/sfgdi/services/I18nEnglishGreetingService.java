package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service(value = "i18nService")
@Profile(value = { "EN" })
public class I18nEnglishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Good afternoon";
	}

}
