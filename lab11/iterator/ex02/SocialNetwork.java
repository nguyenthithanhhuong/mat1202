package lab11.iterator.ex02;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileId);

    public ProfileIterator createCoworkersIterator(String profileId);
}