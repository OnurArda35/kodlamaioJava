package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void addNew(int index, String language) throws Exception;
	void del(int index);
	Language getWithId(int id) throws Exception;
	public void update(int id, String language) throws Exception;
}
