import com.codeclan.example.Folderama.models.File;
import com.codeclan.example.Folderama.models.Folder;
import com.codeclan.example.Folderama.models.User;
import com.codeclan.example.Folderama.repositories.FileRepo;
import com.codeclan.example.Folderama.repositories.FolderRepo;
import com.codeclan.example.Folderama.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepo fileRepository;
    @Autowired
    FolderRepo folderRepository;
    @Autowired
    UserRepo userRepository;
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        Folder funstuff = new Folder("Fun Stuff");
        folderRepository.save(funstuff);
        Folder fantasticstuff = new Folder("Fantastic Stuff");
        folderRepository.save(fantasticstuff);
        File homework = new File("homework", "rb", 5);
        fileRepository.save(homework);
        File moreHomework = new File("more homework", "html", 55);
        fileRepository.save(moreHomework);
        User harryPotter = new User("Harry Potter");
        userRepository.save(harryPotter);
        User ronWeasley = new User("Ron Weasley");
        userRepository.save(ronWeasley);
    }
}