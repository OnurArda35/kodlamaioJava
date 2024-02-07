package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void addNew(int index, String language);
	void del(int index);
	Language getWithId(int id);
	void update(int id, String language);
}
