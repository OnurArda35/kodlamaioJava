package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	private List<Language> languages;
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Language> getAll() {
		//iş kuralları
		return languageRepository.getAll();
	}


	@Override
	public void addNew(int index, String language) throws Exception{
		// TODO Auto-generated method stub
		languages = languageRepository.getAll();
		for (Language item : languages) {
			if(item.getLanguage() == language) {
				throw new Exception("Aynı isimde language var");
			}
		}
		
		if(language.isEmpty()) {
			throw new Exception("language boş olamaz");
		}
		languageRepository.addNew(index,language);
		
	}


	@Override
	public void del(int index) {
		// TODO Auto-generated method stub
		languageRepository.del(index);
		
	}


	@Override
	public Language getWithId(int id) throws Exception{
		// TODO Auto-generated method stub
		boolean flag = false;
		languages = languageRepository.getAll();
		for (Language item : languages) {
			if(item.getId() == id) {
				flag = true;
			}
		}
		if(flag == false) {
			throw new Exception("Böyle bir id yok");
		}
		return languageRepository.getWithId(id);
	}


	@Override
	public void update(int id, String language) throws Exception{
		// TODO Auto-generated method stub
		languageRepository.getWithId(id);
		languageRepository.update(id, language);
		
	}
	
}
