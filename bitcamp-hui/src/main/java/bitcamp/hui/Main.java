package bitcamp.hui;

import bitcamp.hui.handler.HelpHandler;
import bitcamp.hui.handler.assignment.*;
import bitcamp.hui.handler.board.*;
import bitcamp.hui.handler.member.*;
import bitcamp.hui.vo.Assignment;
import bitcamp.hui.vo.Board;
import bitcamp.hui.vo.Member;
import bitcamp.menu.MenuGroup;
import bitcamp.menu.MenuItem;
//import bitcamp.util.ObjectRepository;
import bitcamp.util.Prompt;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prompt prompt = new Prompt(System.in);

        ArrayList<Assignment> assignmentRepository = new ArrayList<>();
        ArrayList<Board> boardRepository = new ArrayList<>();
        ArrayList<Member> memberRepository = new ArrayList<>();
        ArrayList<Board> greetingReposiory = new ArrayList<>();

        MenuGroup mainMenu = new MenuGroup("메인");

        MenuGroup assignmentMenu = new MenuGroup("과제");
        assignmentMenu.add(new MenuItem("등록", new AssignmentAddHandler(assignmentRepository, prompt)));
        assignmentMenu.add(new MenuItem("조회", new AssignmentViewHandler(assignmentRepository, prompt)));
        assignmentMenu.add(new MenuItem("변경", new AssignmentModifyHandler(assignmentRepository, prompt)));
        assignmentMenu.add(new MenuItem("삭제", new AssignmentDeleteHandler(assignmentRepository, prompt)));
        assignmentMenu.add(new MenuItem("목록", new AssignmentListHandler(assignmentRepository, prompt)));
        mainMenu.add(assignmentMenu);

        MenuGroup boardMenu = new MenuGroup("게시글");
        boardMenu.add(new MenuItem("등록", new BoardAddHandler(boardRepository, prompt)));
        boardMenu.add(new MenuItem("조회", new BoardViewHandler(boardRepository, prompt)));
        boardMenu.add(new MenuItem("변경", new BoardModifyHandler(boardRepository, prompt)));
        boardMenu.add(new MenuItem("삭제", new BoardDeleteHandler(boardRepository,prompt)));
        boardMenu.add(new MenuItem("목록", new BoardListHandler(boardRepository, prompt)));
        mainMenu.add(boardMenu);

        MenuGroup memberMenu = new MenuGroup("회원");
        memberMenu.add(new MenuItem("등록", new MemberAddHandler(memberRepository, prompt)));
        memberMenu.add(new MenuItem("조회", new MemberViewHandler(memberRepository, prompt)));
        memberMenu.add(new MenuItem("변경", new MemberModifyHandler(memberRepository, prompt)));
        memberMenu.add(new MenuItem("삭제", new MemberDeleteHandler(memberRepository, prompt)));
        memberMenu.add(new MenuItem("목록", new MemberListHandler(memberRepository, prompt)));
        mainMenu.add(memberMenu);

        MenuGroup greetingMenu= new MenuGroup("가입인사");
        greetingMenu.add(new MenuItem("등록", new BoardAddHandler(greetingReposiory, prompt)));
        greetingMenu.add(new MenuItem("조회", new BoardViewHandler(greetingReposiory, prompt)));
        greetingMenu.add(new MenuItem("변경", new BoardModifyHandler(greetingReposiory, prompt)));
        greetingMenu.add(new MenuItem("삭제", new BoardDeleteHandler(greetingReposiory, prompt)));
        greetingMenu.add(new MenuItem("목록", new BoardListHandler(greetingReposiory, prompt)));
        mainMenu.add(greetingMenu);

        MenuItem helpMenu = new MenuItem("도움말", new HelpHandler());
        mainMenu.add(helpMenu);

        mainMenu.execute(prompt);
        prompt.close();
    }
}