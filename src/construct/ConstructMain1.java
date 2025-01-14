package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90); //ctrl + p 하면 매개변수 뭐가 필요한지 알려줌
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1,member2};

        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
