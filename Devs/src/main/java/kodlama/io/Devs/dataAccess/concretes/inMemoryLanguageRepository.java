package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Repository
public class inMemoryLanguageRepository implements LanguageRepository{
	private Language languageToFind;
	List<Language> languages;
	
	
	public inMemoryLanguageRepository() {
		super();
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"C#"));
		languages.add(new Language(2,"Java"));
		languages.add(new Language(3,"Python"));
		languages.add(new Language(4,"Html"));
		languages.add(new Language(5,"Css"));
		
	}


	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}


	@Override
	public void addNew(int index, String language) {
		// TODO Auto-generated method stub
		languages.add(new Language(index,language));
	}


	@Override
	public void del(int index) {
		// TODO Auto-generated method stub
		languages.remove(index);
	}


	@Override
	public Language getWithId(int id) {
		// TODO Auto-generated method stub
		for (Language language : languages) {
			if(id == language.getId()) {
				languageToFind = language;
			}
		}
		return languageToFind;
	}


	@Override
	public void update(int id, String language) {
		// TODO Auto-generated method stub
		for (Language item : languages) {
			if(item.getId() == id) {
				item.setLanguage(language);
			}
		}
		
	}

}
