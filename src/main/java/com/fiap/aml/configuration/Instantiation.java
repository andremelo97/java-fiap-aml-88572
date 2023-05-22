package com.fiap.aml.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fiap.aml.configuration.dto.AliasDTO;
import com.fiap.aml.configuration.dto.CrimeDTO;
import com.fiap.aml.domain.Identity;
import com.fiap.aml.repository.IdentityRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	IdentityRepository identityRepository;
	
	@Override
	public void run(String... args) throws Exception {
		identityRepository.deleteAll();
		
		Identity omar = new Identity(null, "OMAR ALEXANDER CARDENAS", "American", "Male", "March 23, 1995", "Dark Brown", "Brown",
				"Approximately 5'6\" to 5'7\"", "Approximately 240 to 300 pounds", 100.000 , true, false);	
		
		Identity veronica = new Identity(null, "VERONICA MARIA", "Nicaragua", "Female", "04/04/1973", "Black", "Brown",
				"1.65 metres", "85 kilograms", null , false, true);	
		
		Identity alexis = new Identity(null, "ALEXIS FLORES", "Honduras", "Male", "July 18, 1975, July 18, 1982, September 15, 1980, July 17, 1982",
				"Black", "Brown",
				"5'4\"", "130 to 140 pounds", 100.000 , true, false);
		
		Identity juan1 = new Identity(null, "JUAN DIOS GARZA", "Mexico", "Male", "September 13, 1953", "Black", "Brown",
				"5'7\" to 6'0\"", "170 to 200 pounds", null, true, false);
		
		Identity juan2 = new Identity(null, "JUAN NAJERA QUEZADA", "Mexico", "Male", "July 11, 1958", "Black", "Brown",
				"5'0\" to 5'4\"", "	155 to 165 pounds", null, true, false);
		
		identityRepository.saveAll(Arrays.asList(omar, veronica, alexis, juan1, juan2));
		
		AliasDTO alexisAlias1 = new AliasDTO("Mario Flores");
		AliasDTO alexisAlias2 = new AliasDTO("Mario Roberto Flores");
		AliasDTO alexisAlias3 = new AliasDTO("Mario F. Roberto");
		AliasDTO alexisAlias4 = new AliasDTO("Alex Contreras");
		AliasDTO alexisAlias5 = new AliasDTO("Alesis Contreras");
		
		alexis.getAliases().addAll(Arrays.asList(alexisAlias1, alexisAlias2, alexisAlias3, alexisAlias4, alexisAlias5));
		
		AliasDTO juanAlias1 = new AliasDTO("Juan Sauceda Garza");
		AliasDTO juanAlias2 = new AliasDTO("Juan Sauzeda Garza");
		AliasDTO juanAlias3 = new AliasDTO("Juan DeDios Garza");
		AliasDTO juanAlias4 = new AliasDTO("Juan S. Garza");
		AliasDTO juanAlias5 = new AliasDTO("Juan Dios Garza-Sauceda");
		
		juan1.getAliases().addAll(Arrays.asList(juanAlias1, juanAlias2, juanAlias3, juanAlias4, juanAlias5));
		
		AliasDTO juan2Alias = new AliasDTO("Juan Quezada");
		juan2.getAliases().addAll(Arrays.asList(juan2Alias));
		
		CrimeDTO omarCrime = new CrimeDTO("Omar Alexander Cardenas is wanted for his alleged involvement in the murder of a man that occurred on August 15, 2019, in a large outdoor shopping center in Sylmar, California, immediately next to Los Angeles.  It is alleged that he fired several rounds from a semi-automatic handgun at the victim, striking him in the head and causing his death.  A local arrest warrant was issued for Cardenas on April 3, 2020, in the Superior Court of Los Angeles County after he was charged locally with murder.  A federal arrest warrant from the United States District Court, Central District of California, was issued for Cardenas on September 2, 2021, after he was charged with unlawful flight to avoid prosecution.");
		CrimeDTO veronicaCrime = new CrimeDTO("Charged: Asesinato");
		CrimeDTO alexisCrime = new CrimeDTO("Alexis Flores is wanted for his alleged involvement in the kidnapping and murder of a five-year-old girl in Philadelphia, Pennsylvania. The girl was reported missing in late July of 2000, and was later found strangled to death in a nearby apartment in early August of 2000.");
		CrimeDTO juan1Crime = new CrimeDTO("Juan Dios Garza is wanted for his alleged involvement in the murder of a man in Belle Glade, Florida. On October 21, 1984, Garza allegedly shot and killed a male victim, then shot and wounded the victim's brother.");
		CrimeDTO juan1Crime1 = new CrimeDTO("Garza was charged with second degree murder and attempted second degree murder by the Circuit Court of the Fifteenth Judicial Court, Criminal Division, in and for Palm Beach County, State of Florida, and a state warrant was issued for his arrest on October 24, 1984. A federal arrest warrant was issued by the United States District Court, Southern District of Florida, Miami, Florida, on January 2, 1985, after Garza was charged federally with unlawful flight to avoid prosecution.");
		CrimeDTO juan2Crime = new CrimeDTO("Juan Najera Quezada is being sought for his alleged involvement in the sexual abuse of a six-year-old female in Chicago, Illinois in June of 2007.");
		CrimeDTO juan2Crime1 = new CrimeDTO("In August of 2007, Quezada was arrested by Chicago Police Department officers after he was identified as having sexually assaulted the child, who lived in the same apartment building as him. At the time of the incident, Quezada resided with a woman who ran a daycare service out of the home. Quezada failed to appear following his release on bond from the arrest, and is also being sought for questioning in connection with the sexual assault of another child while out on bond.");
		CrimeDTO juan2Crime2 = new CrimeDTO("Quezada was charged with aggravated criminal sexual abuse of a child by the Circuit Court of Cook County, Illinois, and a state warrant was issued for his arrest on September 30, 2008. On February 9, 2012, Quezada was charged in the United States District Court, Northern District of Illinois, Eastern Division, Chicago, Illinois, with unlawful flight to avoid prosecution and a warrant was issued for his arrest.");
		
		omar.getCrimes().addAll(Arrays.asList(omarCrime));
		veronica.getCrimes().addAll(Arrays.asList(veronicaCrime));
		alexis.getCrimes().addAll(Arrays.asList(alexisCrime));
		juan1.getCrimes().addAll(Arrays.asList(juan1Crime, juan1Crime1));
		juan2.getCrimes().addAll(Arrays.asList(juan2Crime, juan2Crime1, juan2Crime2));
		
		identityRepository.save(omar);
		identityRepository.save(veronica);
		identityRepository.save(alexis);
		identityRepository.save(juan1);
		identityRepository.save(juan2);
	}
	
}
