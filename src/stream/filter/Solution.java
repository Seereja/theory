package stream.filter;

import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    @Data
    static class User {
        private final String username;
        private final List<Group> groups;
    }

    @Data
    static class Group {
        private final String name;
    }

    public static List<User> getUsersWithGroupsFiltered(Stream<User> users, String groupNamePrefix) {

        return users
                .filter(user -> user.getGroups()
                        .stream()
                        .anyMatch(group -> group
                                .getName()
                                .startsWith(groupNamePrefix)))
                .collect(Collectors.toList());

    }
}
