public class ProfileService {

  public void saveProfile(ProfileRepository profileRepository) {
    ProfileDBRepository profileDBRepository = new ProfileDBRepository();
    System.out.println(profileDBRepository instanceof ProfileRepository);

    profileRepository.save();
  }
}
