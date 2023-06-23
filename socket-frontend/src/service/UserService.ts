import axios from "axios";
export class UserService {
  private static _userService: UserService;

  public static getInstance(): UserService {
    if (!UserService._userService) {
      UserService._userService = new UserService();
    }
    return UserService._userService;
  }

  public checkUser(user: any) {
    const url = "http://localhost:8081/login";
    return axios.post(url, user, {
      headers: {
        "Content-Type": "application/json",
      },
    });
  }
}
